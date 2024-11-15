package in.pwskills.nitin.Generator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class GenerateId implements IdentifierGenerator{

	@Override
	public Serializable generate(SharedSessionContractImplementor si, Object arg1) throws HibernateException {
		String id = "";
		int i = 0;
		try {
			Connection connection = si.connection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select id from temp_table");
			if (resultSet.next())
				i = resultSet.getInt(1);
			if (i <= 9)
				id = "c00" + i;
			else if (i > 9 && i <= 99)
				id = "c0" + i;
			else
				id = "c" + i;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return id;
	}
}
