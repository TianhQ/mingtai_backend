package com.mingtai.mingtai_backend.mappers;

import com.mingtai.mingtai_backend.pojos.Orchid;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrchidMapper {
    List<Orchid> getAllOrchids();
    boolean insertOrchid( @Param("orchid") Orchid orchid);

    boolean deleteOrchid( @Param("id") int id);

    boolean updateOrchid( @Param("id") int id, @Param("orchid") Orchid orchid);

    boolean updateDeleteOrchidParentID(@Param("id") int id, @Param("parent_id") int parent_id);
    boolean insertChildOrchid(@Param("orchid") Orchid orchid);

    boolean updateOrchidWhenDeleteSubCategory( @Param("original_id") int original_id, @Param("new_id") int new_id);
}
