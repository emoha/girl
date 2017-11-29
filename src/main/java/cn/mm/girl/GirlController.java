package cn.mm.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    /**
     *查询所有女
     * @return
     */
    @GetMapping(value = "/girls")
    public List<Girl> girlList(){

        return girlRepository.findAll();
    }

    /**
     * 新增一个女
     */
    @PostMapping(value = "/girls")
    public Girl girlAdd(@RequestParam("cupSize")String cupSize
            ,@RequestParam("age")Integer age){
        Girl girl = new Girl();
        girl.setCupSize(cupSize);
        girl.setAge(age);
        return girlRepository.save(girl);
    }

    //查询一个女生
   // @GetMapping(value = "{id}")


}
