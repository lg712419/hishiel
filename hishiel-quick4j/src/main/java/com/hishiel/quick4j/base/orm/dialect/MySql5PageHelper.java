package com.hishiel.quick4j.base.orm.dialect;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Hishiel
 * @create 2016年11月17日下午10:34:04
 */
public class MySql5PageHelper {

	/**
	 * 得到查询总数的Sql
	 */
	public static String getCountString(String querySelect) {

		String lineSql = getLineSql(querySelect);
		int orderIndex = getLastOrderInsertPoint(lineSql);
		int fromIndex = getAfterFromInsertPoint(lineSql);
		String select = querySelect.substring(0, fromIndex);
		// 如果SELECT中包含DISTINCT只能在外层包含COUNT
		if (select.toLowerCase().indexOf("select distinct") != -1
				|| querySelect.toLowerCase().indexOf("group by") != -1) {
			return new StringBuffer(querySelect.length()).append("select count(1) count from (")
					.append(querySelect.substring(0, orderIndex)).append(" ) t").toString();
		} else {
			return new StringBuffer(querySelect.length()).append("select count(1) count ")
					.append(querySelect.substring(fromIndex, orderIndex)).toString();
		}
	}

	/**
	 * 得到分页的Sql
	 * 
	 * @param offset
	 *            偏移量
	 * @param limit
	 *            位置
	 * @return 分页SQL
	 */
	public static String getLimitString(String sql, int offset, int limit) {
		return getLineSql(sql) + " limit" + offset + "," + limit;
	}

	/**
	 * 将Sql语句变成一条语句，并且每个单词的间隔都是1个空格
	 * 
	 * @param sql
	 *            Sql语句
	 * @return 如果Sql是null返回空，否则返回转化后的Sql
	 */
	private static String getLineSql(String sql) {
		return sql.replaceAll("[\r\n]", " ").replaceAll("\\s{2,}", " ");
	}

	/**
	 * 获取最后一个Order by 的插入点位置
	 */
	private static int getLastOrderInsertPoint(String sql) {

		int orderIndex = sql.toLowerCase().lastIndexOf("order by");
		if (orderIndex == -1) {
			orderIndex = sql.length();
		}
		if (!isBracketCanPartnership(sql.substring(orderIndex, sql.length()))) {
			throw new RuntimeException("MySql分页必须要有Order by 语句!");
		}
		return orderIndex;
	}

	/**
	 * 获取Sql第一个正确的FROM的插入点
	 */
	private static int getAfterFromInsertPoint(String sql) {
		String regex = "\\s+FROM\\s+";
		Matcher matcher = Pattern.compile(regex, Pattern.CASE_INSENSITIVE).matcher(sql);
		while (matcher.find()) {
			int fromStartIndex = matcher.start(0);
			String text = sql.substring(0, fromStartIndex);
			if (isBracketCanPartnership(text)) {
				return fromStartIndex;
			}
		}
		return 0;
	}

	/**
	 * 判断括号"()"是否匹配，并不会判断排列顺序是否正确
	 * 
	 * @param text
	 *            要判断的文本
	 * @return 如果匹配返回true，否则返回false
	 */
	private static boolean isBracketCanPartnership(String text) {
		if (text == null || (getCountOfIndex('(', text) != getCountOfIndex(')', text))) {
			return false;
		}
		return true;
	}

	/**
	 * 获取一个字符在另一个字符串中出现的次数
	 * 
	 * @param c
	 *            字符
	 * @param text
	 *            文本
	 * @return
	 */
	private static int getCountOfIndex(char c, String text) {
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			count = (text.charAt(i) == c) ? count + 1 : count;
		}
		return count;
	}
}
