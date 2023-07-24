package cn.xuyanwu.spring.file.storage.platform;

/**
 * 存储平台的 Client 的对象的工厂接口
 */
public interface FileStorageClientFactory<Client> extends AutoCloseable {

    /**
     * 获取平台
     */
    String getPlatform();

    /**
     * 获取 Client ，使用完后需要归还
     */
    Client getClient();

    /**
     * 归还 Client
     */
    default void returnClient(Client client) {
    }

    /**
     * 释放相关资源
     */
    @Override
    default void close() {
    }
}
