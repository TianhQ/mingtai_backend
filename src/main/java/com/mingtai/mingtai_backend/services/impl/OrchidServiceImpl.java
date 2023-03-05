package com.mingtai.mingtai_backend.services.impl;

import com.mingtai.mingtai_backend.mappers.CategoryMapper;
import com.mingtai.mingtai_backend.mappers.OrchidMapper;
import com.mingtai.mingtai_backend.pojos.Orchid;
import com.mingtai.mingtai_backend.services.interfaces.OrchidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class OrchidServiceImpl implements OrchidService {
    @Autowired
    private OrchidMapper orchidMapper;

    @Autowired
    private CategoryMapper categoryMapper;
    @Override
    public List<Orchid> selectAllOrchids() {
        return orchidMapper.getAllOrchids();
    }

    @Override
    public boolean updateOrchid(int id, Orchid orchid) {
        return orchidMapper.updateOrchid(id, orchid);
    }

    @Override
    @Transactional
    public boolean deleteOrchid(int id) {
        orchidMapper.updateDeleteOrchidParentID(id);
        return orchidMapper.deleteOrchid(id);
    }

    @Override
    public boolean insertOrchid(Orchid orchid) {
        if(orchid.getParent_id() == 0){
            return orchidMapper.insertOrchid(orchid);
        }
        return orchidMapper.insertChildOrchid(orchid);

    }


}
