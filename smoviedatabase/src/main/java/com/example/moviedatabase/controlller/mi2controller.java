package com.example.moviedatabase.controlller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.moviedatabase.interfacec.DataInterface;
import com.example.moviedatabase.model.ObjectClass;
import com.example.moviedatabase.model2.databaseinsertionclass;
@Controller

public class mi2controller {
	@Autowired
	DataInterface d;
	@Autowired
	databaseinsertionclass dat;
	
	@RequestMapping("/mi2")
	public String home(@RequestBody ObjectClass obj)
	{
		dat.setRating(obj.getRating());
		dat.setUsername(obj.getUsername());
		if(obj.getMovieid()==1)
		{dat.setMoviename("Bajirao Mastani");}
		else if(obj.getMovieid()==2)
		{dat.setMoviename("Kites");	}
		else if(obj.getMovieid()==3)
		{dat.setMoviename("Love Aj Kal");	}
		else if(obj.getMovieid()==4)
		{dat.setMoviename("Dhoom 2");	}
		else if(obj.getMovieid()==5)
		{dat.setMoviename("ZNMD");	}
		else if(obj.getMovieid()==6)
		{dat.setMoviename("YJHD");	}
		else if(obj.getMovieid()==7)
		{dat.setMoviename("Teen Yaarir Kotha");	}
		else if(obj.getMovieid()==8)
		{dat.setMoviename("Hum apke hain kaun");	}
		else if(obj.getMovieid()==9)
		{dat.setMoviename("Hum dil de chuke sanam");	}
		else if(obj.getMovieid()==10)
		{dat.setMoviename("Hum Tum");	}
		else if(obj.getMovieid()==11)
		{dat.setMoviename("humari adhuri kahani");	}
		else if(obj.getMovieid()==12)
		{dat.setMoviename("alladin");	}
		else if(obj.getMovieid()==13)
		{dat.setMoviename("Ae Dil hain Mushkil");	}
		else if(obj.getMovieid()==14)
		{dat.setMoviename("Hum 2 Humare 5");	}
		else if(obj.getMovieid()==15)
		{dat.setMoviename("Hulchul");	}
		else if(obj.getMovieid()==16)
		{dat.setMoviename("Humgama  ");	}
		else dat.setMoviename("Wrong Input");
		System.out.println(dat);
		d.save(dat);
		return "MOvies OK";
	}
	


}
