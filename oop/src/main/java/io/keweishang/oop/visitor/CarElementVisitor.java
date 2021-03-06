package io.keweishang.oop.visitor;

/**
 * The visitor design pattern is a way of separating an algorithm from an object structure on which it operates. A practical result of this separation is the ability to add new operations to extant object structures without modifying the structures. It is one way to follow the open/closed principle.
 * <p>
 * In essence, the visitor allows adding new virtual functions to a family of classes, without modifying the classes. Instead, a visitor class is created that implements all of the appropriate specializations of the virtual function.
 */
interface CarElementVisitor {
  // visit the concrete elements
  void visit(Body body);

  void visit(Car car);

  void visit(Engine engine);

  void visit(Wheel wheel);
}