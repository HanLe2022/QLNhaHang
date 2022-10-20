
package dao;

import java.util.List;

abstract public class EduSysDAO<EntityType, KeyType> {
    // Ở mức này không biết được Entity và Key cụ thể nên tổng quát hóa (generic). Nó sẽ được cụ thể hóa ở lớp con
    abstract public void insert(EntityType entity);
    abstract public void update(EntityType entity);
    abstract public void delete(KeyType id);
    abstract public EntityType selectById(KeyType id);
    abstract public List<EntityType> selectAll();
    abstract protected List<EntityType> selectBySql(String sql, Object...args);
}
