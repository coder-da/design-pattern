装饰者模式：动态地将责任附加到对象上。若要扩展功能，装饰者提供了比继承更有弹性的替代方案。

示例：咖啡饮料有多个品种，另外，还需要根据所添加的配料计算价格

分析：
1、基类为Beverage，所有咖啡继承基类，具有不同的品种，基类有计算价格的方法。
2、如果直接在基类添加配料成员变量，各个子类有覆盖计算价格的方法，那么，类会十分臃肿，有的咖啡没有对应配料，容易产生错误，且不便于扩展。
3、为此，我们使用组合，装饰者类同样继承基类，并有一个实例变量指向咖啡的引用，并依赖委托将配料的价格加上去。