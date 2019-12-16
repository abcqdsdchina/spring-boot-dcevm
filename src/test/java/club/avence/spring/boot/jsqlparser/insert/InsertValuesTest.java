package club.avence.spring.boot.jsqlparser.insert;

import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.insert.Insert;
import org.junit.Test;

public class InsertValuesTest {

    @Test
    public void test() throws Throwable {
        Statement statement = CCJSqlParserUtil.parse("insert into hm_fnd_tpa values (seq_hm_fnd_tpa_id.nextval, 1, 1, 'hello', sysdate)");
        Insert insertStatement = (Insert) statement;
        System.out.println(insertStatement);
    }

}
