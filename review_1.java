// EntityControllerJava.java
    import java.sql.Connection;
    import java.sql.Statement;
    import java.util.Collections;
     
    public class EntityControllerJava {
        public Connection connection;
     
        public EntityControllerJava(Connection connection) {
            connection = connection;
        }
     
        public synchronized void saveEntity(Entity entity) throws Exception {
            System.out.println("start");
     
            if (!validate(entity)) {
                throw new RuntimeException("No valid");
            }
            Statement statement = connection.createStatement();
            boolean execute = statement.execute("INSERT INTO entity (id, name) values (" + entity.getId() + ", " + entity.getName() + ")");
            if (!execute) {
                throw new IllegalStateException("No save");
            }
     
            System.out.println("finish");
        }
     
        public void delete(Entity entity) throws Exception {
            System.out.println("start");
     
            Statement statement = connection.createStatement();
            boolean execute = statement.execute("DELETE FROM entity WHERE id=" + entity.getName());
            if (!execute) {
                throw new IllegalStateException("No deleted");
            }
     
            System.out.println("finish");
        }
     
        public boolean validate(Entity entity) {
            //some code here
            return false;
        }
     
        public class Entity{
            private String id;
            private String name;
     
            public String getId() {
                return id;
            }
     
            public String getName() {
                return name;
            }
        }
    }
