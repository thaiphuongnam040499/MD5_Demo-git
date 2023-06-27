package rikkei.academy.service;

public interface IGenericService<T,E> {
    T save(T t);
}
