package vn.edu.leading.uaa.services;

import org.springframework.stereotype.Service;
import vn.edu.leading.uaa.models.RoleModel;
import vn.edu.leading.uaa.repositories.RoleRepository;


import java.util.List;

@Service
public class RoleServiceIpml implements RoleService{

    private final RoleRepository roleRepository;

    public RoleServiceIpml(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<RoleModel> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public List<RoleModel> search(String term) {
        return roleRepository.findByNameContaining(term);
    }

    @Override
    public RoleModel findById(Long id) {
        return roleRepository.findById(id).get();
    }

    @Override
    public boolean update(RoleModel role) {
        RoleModel roleModel = roleRepository.findById(role.getId()).orElse(null);
        if (roleModel == null)
            return false;
        roleRepository.save(role);
        return true;
    }

    @Override
    public void save(RoleModel role) {
        roleRepository.save(role);
    }

    @Override
    public boolean delete(Long id) {
        RoleModel roleModel = roleRepository.findById(id).orElse(null);
        if (roleModel == null)
            return false;
        roleRepository.delete(roleModel);
        return true;
    }


}
