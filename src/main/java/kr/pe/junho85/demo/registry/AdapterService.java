package kr.pe.junho85.demo.registry;

public interface AdapterService<T> {
    void process(T request);
}
