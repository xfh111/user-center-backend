package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.UserTeam;
import generator.service.UserTeamService;
import generator.mapper.UserTeamMapper;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class UserTeamServiceImpl extends ServiceImpl<UserTeamMapper, UserTeam>
    implements UserTeamService{

}




