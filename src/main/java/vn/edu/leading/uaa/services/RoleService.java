package vn.edu.leading.uaa.services;

import vn.edu.leading.uaa.models.RoleModel;

import java.util.List;

public interface RoleService {

    List<RoleModel> findAll();

    List<RoleModel> search(String term);

    RoleModel findById(Long id);

    boolean update(RoleModel role);

    void save(RoleModel role);

    boolean delete(Long id);
}
