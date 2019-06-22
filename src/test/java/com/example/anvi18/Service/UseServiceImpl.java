package com.example.anvi18.Service;
import com.example.anvi18.Entity.User;
public class UseServiceImpl implements UserService {
@Override
		public User Create(User u)
		{
		return null;
		}
		@Override
		public User[] retrieveName() {
			User u=new User("Susmitha","f");
			User u1=new User("Honey","f");
			User u2=new User("Susanth","m");
			User u3=new User("Prasanthi","f");
			User u4=new User("Sai teja","m");
			User[] S= {u,u1,u2,u3,u4};
			return S;
		}
		@Override
		public User update(User u) {
			return null;
		}
		@Override
		public void deleteByName(User u) {
			
		}
}
