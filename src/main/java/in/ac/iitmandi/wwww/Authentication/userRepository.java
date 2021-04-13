package in.ac.iitmandi.wwww.Authentication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface userRepository extends JpaRepository<user , Integer> {
	
	 user findByEmail(String email);
//	 @Modifying
//	 @Query("insert into credentials (uname,email,dob) values(:name,:email,:age")
//	 public int modifyingQueryInsertPerson(@Param("id")Long id, @Param("name")String name, @Param("age")String age);
//	    
	  user save(user use);
}
