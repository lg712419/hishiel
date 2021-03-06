/**
 * 这里使用了接口式编程方式，为每一个映射文件指定一个映射接口。考虑到每种基础数据都会对应着CRUD的操作，所以这里对映射文件中的一些元素的命名规则进行统一设计，且提供了映射接口的基接口。
 * 如果其他DAO接口需要增加额外的方法，只需要继承此接口并定义额外的方法签名即可。
 */
/**
 * @author hishiel
 * @since 2016年11月8日上午11:31:27
 */
package com.hishiel.test.dao;
