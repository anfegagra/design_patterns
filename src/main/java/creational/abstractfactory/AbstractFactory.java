package main.java.creational.abstractfactory;

public interface AbstractFactory<T> {

	T create(String type);
}
