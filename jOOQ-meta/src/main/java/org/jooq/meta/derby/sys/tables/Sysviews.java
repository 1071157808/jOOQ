/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.derby.sys.tables;


import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.meta.derby.sys.Sys;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sysviews extends TableImpl<Record> {

    private static final long serialVersionUID = 1025332522;

    /**
     * The reference instance of <code>SYS.SYSVIEWS</code>
     */
    public static final Sysviews SYSVIEWS = new Sysviews();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>SYS.SYSVIEWS.TABLEID</code>.
     */
    public static final TableField<Record, String> TABLEID = createField(DSL.name("TABLEID"), org.jooq.impl.SQLDataType.CHAR(36).nullable(false), SYSVIEWS, "");

    /**
     * The column <code>SYS.SYSVIEWS.VIEWDEFINITION</code>.
     */
    public static final TableField<Record, String> VIEWDEFINITION = createField(DSL.name("VIEWDEFINITION"), org.jooq.impl.SQLDataType.LONGVARCHAR.nullable(false), SYSVIEWS, "");

    /**
     * The column <code>SYS.SYSVIEWS.CHECKOPTION</code>.
     */
    public static final TableField<Record, String> CHECKOPTION = createField(DSL.name("CHECKOPTION"), org.jooq.impl.SQLDataType.CHAR(1).nullable(false), SYSVIEWS, "");

    /**
     * The column <code>SYS.SYSVIEWS.COMPILATIONSCHEMAID</code>.
     */
    public static final TableField<Record, String> COMPILATIONSCHEMAID = createField(DSL.name("COMPILATIONSCHEMAID"), org.jooq.impl.SQLDataType.CHAR(36), SYSVIEWS, "");

    /**
     * No further instances allowed
     */
    private Sysviews() {
        this(DSL.name("SYSVIEWS"), null);
    }

    private Sysviews(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Sysviews(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Sysviews(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, SYSVIEWS);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }
}