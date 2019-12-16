package club.avence.spring.boot.jsqlparser.insert;

import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.insert.Insert;
import org.junit.Test;

public class InsertTest {

    @Test
    public void test() throws Throwable {
        Statement statement = CCJSqlParserUtil.parse("insert into hm_fnd_tpa select * from hm_log_tpa union all select * from hm_fnd_tpa");
        Insert insertStatement = (Insert) statement;
        System.out.println(insertStatement);
    }

}
