package kr.pe.junho85.demo.registry;

public interface ServiceRegistry {
    <T> AdapterService<T> getService(String servicename);
}
