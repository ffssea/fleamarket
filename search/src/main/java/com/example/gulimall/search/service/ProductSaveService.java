package com.example.gulimall.search.service;

import com.example.common.to.SkuEsModel;

import java.io.IOException;
import java.util.List;


public interface ProductSaveService {
    boolean productStatusUp(List<SkuEsModel> skuEsModels) throws IOException;
}
