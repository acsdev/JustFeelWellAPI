/*
 * This file is generated by jOOQ.
 */
package br.hackthon.drugstore.jooq.tables.records;


import br.hackthon.drugstore.jooq.tables.Drugstore;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DrugstoreRecord extends UpdatableRecordImpl<DrugstoreRecord> implements Record5<Long, String, String, BigDecimal, BigDecimal> {

    private static final long serialVersionUID = 1459064081;

    /**
     * Setter for <code>drugstore.drugstore.id_store</code>.
     */
    public void setIdStore(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>drugstore.drugstore.id_store</code>.
     */
    public Long getIdStore() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>drugstore.drugstore.ds_name</code>.
     */
    public void setDsName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>drugstore.drugstore.ds_name</code>.
     */
    public String getDsName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>drugstore.drugstore.ds_address</code>.
     */
    public void setDsAddress(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>drugstore.drugstore.ds_address</code>.
     */
    public String getDsAddress() {
        return (String) get(2);
    }

    /**
     * Setter for <code>drugstore.drugstore.vl_latitude</code>.
     */
    public void setVlLatitude(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>drugstore.drugstore.vl_latitude</code>.
     */
    public BigDecimal getVlLatitude() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>drugstore.drugstore.vl_longitude</code>.
     */
    public void setVlLongitude(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>drugstore.drugstore.vl_longitude</code>.
     */
    public BigDecimal getVlLongitude() {
        return (BigDecimal) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, String, String, BigDecimal, BigDecimal> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, String, String, BigDecimal, BigDecimal> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Drugstore.DRUGSTORE_.ID_STORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Drugstore.DRUGSTORE_.DS_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Drugstore.DRUGSTORE_.DS_ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return Drugstore.DRUGSTORE_.VL_LATITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return Drugstore.DRUGSTORE_.VL_LONGITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getIdStore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getDsName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDsAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getVlLatitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getVlLongitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getIdStore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getDsName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDsAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getVlLatitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getVlLongitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DrugstoreRecord value1(Long value) {
        setIdStore(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DrugstoreRecord value2(String value) {
        setDsName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DrugstoreRecord value3(String value) {
        setDsAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DrugstoreRecord value4(BigDecimal value) {
        setVlLatitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DrugstoreRecord value5(BigDecimal value) {
        setVlLongitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DrugstoreRecord values(Long value1, String value2, String value3, BigDecimal value4, BigDecimal value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DrugstoreRecord
     */
    public DrugstoreRecord() {
        super(Drugstore.DRUGSTORE_);
    }

    /**
     * Create a detached, initialised DrugstoreRecord
     */
    public DrugstoreRecord(Long idStore, String dsName, String dsAddress, BigDecimal vlLatitude, BigDecimal vlLongitude) {
        super(Drugstore.DRUGSTORE_);

        set(0, idStore);
        set(1, dsName);
        set(2, dsAddress);
        set(3, vlLatitude);
        set(4, vlLongitude);
    }
}
