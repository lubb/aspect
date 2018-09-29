# aspect
aop切面编程
Execution切点函数
void chop(String,int)
匹配目标类任意修饰符方法、返回void、方法名chop、带有一个String和一个int型参数的方法
public void chop(*)
匹配目标类public修饰、返回void、方法名chop、带有一个任意类型参数的方法
public String *o*(..)
 匹配目标类public修饰、返回String类型、方法名中带有一个o字符、带有任意数量任意类型参数的方法
public void *o*(String,..)
 匹配目标类public修饰、返回void、方法名中带有一个o字符、带有任意数量任意类型参数，但第一个参数必须有且为String型的方法
也可以指定类：
public void examples.chap03.Horseman.*(..)
匹配Horseman的public修饰、返回void、不限方法名、带有任意数量任意类型参数的方法
public void examples.chap03.*man.*(..)
匹配以man结尾的类中public修饰、返回void、不限方法名、带有任意数量任意类型参数的方法
指定包：
public void examples.chap03.*.chop(..)
匹配examples.chap03包下所有类中public修饰、返回void、方法名chop、带有任意数量任意类型参数的方法
public void examples..*.chop(..)
匹配examples.包下和所有子包中的类中public修饰、返回void、方法名chop、带有任意数量任意类型参数的方法
