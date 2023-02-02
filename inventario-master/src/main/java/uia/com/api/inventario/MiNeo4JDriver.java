package uia.com.api.inventario;

import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.neo4j.core.Neo4jClient;
import org.springframework.stereotype.Component;

@Component
public class MiNeo4JDriver {

		public static Neo4jClient neo4jClient;
		
		public static Neo4jClient getNeo4jClient() {
			return neo4jClient;
		}

		public static void setNeo4jClient(Neo4jClient neo4jClient) {
			MiNeo4JDriver.neo4jClient = neo4jClient;
		}

	   /* A private Constructor prevents any other
	    * class from instantiating.
	    */
	   public MiNeo4JDriver()
	   {
		   Driver driver = GraphDatabase
				   .driver("neo4j://localhost:7687", AuthTokens.basic("neo4j", "root"));

		   neo4jClient = Neo4jClient.create(driver);
	   }

	   /* Static 'instance' method */
	   public static  Neo4jClient getInstance( )
	   {
	      return neo4jClient;
	   }

	   public static Neo4jClient getMiNeo4JDriver() {
		return neo4jClient;
	}

	public static void setMiNeo4JDriver(Neo4jClient neo4jClient)
	{
		MiNeo4JDriver.neo4jClient = neo4jClient;
	}

	/* Other methods protected by consultorMainCatalogos-ness */
	   protected static void demoMethod( ) {
	      System.out.println("demoMethod for consultorMainCatalogos");
	   }
	}