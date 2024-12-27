package com.yixin.code.data_check.service.impl;

import com.yixin.code.data_check.domain.PersonInfo;
import com.yixin.code.data_check.service.IPersonInfoService;
import com.yixin.code.data_check.mapper.PersonInfoMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author weilong
 * @since 2024-12-27
 */
@Service
public class PersonInfoServiceImpl extends ServiceImpl<PersonInfoMapper, PersonInfo> implements IPersonInfoService {

}
