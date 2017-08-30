package org.apache.camel.component.sql.stored;

import org.apache.camel.component.sql.SqlComponentVerifierExtension;

public class SqlStoredComponentVerifierExtension extends SqlComponentVerifierExtension {

    public SqlStoredComponentVerifierExtension() {
        super("sql-stored");
    }
    public SqlStoredComponentVerifierExtension(SqlStoredComponent component) {
        super("sql-stored");
    }

}
