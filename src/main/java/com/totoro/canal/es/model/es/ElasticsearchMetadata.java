package com.totoro.canal.es.model.es;

import java.util.List;
import java.util.Map;

/**
 * 说明 . <br>
 * <p>
 * <p>
 * Copyright: Copyright (c) 2017/11/19 下午6:32
 * <p>
 * Company: xxx
 * <p>
 *
 * @author zhongcheng_m@yeah.net
 * @version 1.0.0
 */
public class ElasticsearchMetadata {

    public final static int INSERT = 1;

    public final static int DELETE = 2;

    public final static int UPDATE = 3;

    private Long batchId;

    private List<EsEntry> esEntries;


    public static class EsEntry {

        private String index;

        private String type;

        private int eventType;

        private List<EsRowData> esRowDatas;

        public String getIndex() {
            return index;
        }

        public EsEntry setIndex(String index) {
            this.index = index;
            return this;
        }

        public String getType() {
            return type;
        }

        public EsEntry setType(String type) {
            this.type = type;
            return this;
        }

        public List<EsRowData> getEsRowDatas() {
            return esRowDatas;
        }

        public EsEntry setEsRowDatas(List<EsRowData> esRowDatas) {
            this.esRowDatas = esRowDatas;
            return this;
        }

        public int getEventType() {
            return eventType;
        }

        public EsEntry setEventType(int eventType) {
            this.eventType = eventType;
            return this;
        }
    }


    public static class EsRowData {
        public String id;

        public Map<String, Object> rowData;

        public String getId() {
            return id;
        }

        public EsRowData setId(String id) {
            this.id = id;
            return this;
        }

        public Map<String, Object> getRowData() {
            return rowData;
        }

        public EsRowData setRowData(Map<String, Object> rowData) {
            this.rowData = rowData;
            return this;
        }
    }


    public Long getBatchId() {
        return batchId;
    }

    public ElasticsearchMetadata setBatchId(Long batchId) {
        this.batchId = batchId;
        return this;
    }

    public List<EsEntry> getEsEntries() {
        return esEntries;
    }

    public ElasticsearchMetadata setEsEntries(List<EsEntry> esEntries) {
        this.esEntries = esEntries;
        return this;
    }
}
