package com.sitech.demo;

import com.sitech.demo.domain.Fruit;
import com.sitech.demo.domain.Fruits;
import com.sitech.demo.dto.FruitsDto;
import com.sitech.demo.service.CustInfoAoService;
import com.sitech.ijcf.message6.dt.in.InDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustServiceApplicationTests {

	@Test
	public void contextLoads() {

		CustInfoAoService ca =new CustInfoAoService();

		  InDTO<FruitsDto> in = new InDTO<>();
		FruitsDto fd =new FruitsDto();
		List<Fruits> list=new ArrayList<>();

		 list.add(new Fruits("aa", "dd", "ff"));
		fd.setFruitsList(list);
		  in.setBody(fd);
		Map map = ca.testDtoBind(in);
		System.out.println(map.toString());

	}


	@Test
	public void contextLoads2() {
		CustInfoAoService ca =new CustInfoAoService();
		Fruit fruit = ca.qryFruit(1);
		System.out.println(fruit.toString());
	}

	@Test
	public void contextLoads3() {

		CustInfoAoService ca =new CustInfoAoService();
		String fruit = ca.qryTest(22);
		System.out.println(fruit);

	}

}
