
	
设计模式
	* 策略模式

            定义了算法族，分别封装起来，让他们之间可以互相替换，此模式让算法的变化独立于使用算法的客户
	* 观察者模式

            定义了对象之间的一对多依赖，这样一来，当一个对象改变状态时，他的所有依赖者都会收到通知并自动更新
	* 装饰者模式

            动态的将责任附加到对象上，若要扩展功能，装饰者提供了比继承更有弹性的替代方案
	* 工厂模式

            定义了一个创建对象的接口，但由子类决定要实例化的类是哪个，工厂方法让类把实例化推迟到子类            通过让子类决定该创建的对象是什么，来达到将对象的创建过程封装的目的
	* 抽象工厂模式

            提供一个接口，用于创建相关或依赖对象的家族而不需要明确确定具体类
	* 单例模式

            确保一个类只有一个实例，并提供一个全局访问点
	* 命令模式

            将请求封装成对象，以便使用不同的请求、队列或者日志来参数化其他对象，命令模式也支持可撤销的操作
	* 适配器模式

            将一个类的接口，转换成客户想要的另一个类的接口，适配器将不兼容的类合作
	* 外观模式

            提供了一个统一的接口，用来访问子系统中的一群接口，外观定义了一个高层接口，让子系统更容易使用
	* 模板方法模式

            在一个方法中定义一个算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以在不改变算法结构情况下，重新定义算法的某些步骤
	* 迭代器模式

            提供一种方法顺序访问一个聚合对象中的各个元素，而又不暴露其内部的表示
	* 组合模式

            允许你将对象组合成树形结构来表现"整体/部分"层次结构，组合能让客户以一致的方式处理个别对象以及对象组合            一个类做了2件事，但是对于客户来说是透明的
	* State pattern

            allows an object to alter its behavior when its internal state changes, The object will aprear to change its class
	* Proxy pattern

            Provides a surrogate or placeholder for another object to control access to it
----------------------------------------------------------------------------------------------------
设计原则

	* 找出应用中可能需要变化的地方，把他们独立出来，不要和那些不需变化的代码混在一起
	* 针对接口编程而不是针对实现编程
	* 多用组合，少用继承
	* 为交互对象之间的松耦合而努力
	* 类应该对扩展开放，对修改关闭
	* 要依赖抽象，不要依赖具体类
	* 最少知识原则，只和你的密友谈话
	* 好莱坞原则：别调用我们，我们会调用你，其实就是高层组件尽量避免依赖底层组件，或者说环装依赖
	* 单一责任：一个类应该只有一个引起变化的原因 (内聚也有相似的含义)



