<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="人员编号" prop="employeeCode">
        <el-input
          v-model="queryParams.employeeCode"
          placeholder="请输入人员编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="人员姓名" prop="employeeName">
        <el-input
          v-model="queryParams.employeeName"
          placeholder="请输入人员姓名"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="性别" prop="gender">
        <el-select v-model="queryParams.gender" placeholder="请选择性别" clearable>
          <el-option
            v-for="dict in dict.type.sys_user_sex"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="身份证号" prop="idCard">
        <el-input
          v-model="queryParams.idCard"
          placeholder="请输入身份证号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="手机号码" prop="phone">
        <el-input
          v-model="queryParams.phone"
          placeholder="请输入手机号码"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="邮箱" prop="email">
        <el-input
          v-model="queryParams.email"
          placeholder="请输入邮箱"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="人员类别" prop="employeeType">
        <el-select v-model="queryParams.employeeType" placeholder="请选择人员类别" clearable>
          <el-option
            v-for="dict in dict.type.hrs_employee_type"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="部门" prop="deptId">
        <treeselect
          v-model="queryParams.deptId"
          :options="deptOptions"
          :normalizer="normalizer"
          placeholder="请选择部门"
        />
      </el-form-item>
      <el-form-item label="职位" prop="position">
        <el-input
          v-model="queryParams.position"
          placeholder="请输入职位"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="入职日期" prop="entryDate">
        <el-date-picker
          v-model="queryParams.entryDate"
          type="date"
          placeholder="选择入职日期"
          value-format="yyyy-MM-dd"
        />
      </el-form-item>
      <el-form-item label="状态" prop="status">
        <el-select v-model="queryParams.status" placeholder="请选择状态" clearable>
          <el-option
            v-for="dict in dict.type.hrs_employee_status"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="学历" prop="education">
        <el-select v-model="queryParams.education" placeholder="请选择学历" clearable>
          <el-option
            v-for="dict in dict.type.hrs_education"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="专业" prop="major">
        <el-input
          v-model="queryParams.major"
          placeholder="请输入专业"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="毕业院校" prop="school">
        <el-input
          v-model="queryParams.school"
          placeholder="请输入毕业院校"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="工作年限" prop="workYears">
        <el-input-number
          v-model="queryParams.workYears"
          placeholder="请输入工作年限"
          clearable
          :min="0"
          :max="100"
        />
      </el-form-item>
      <el-form-item label="婚姻状况" prop="maritalStatus">
        <el-select v-model="queryParams.maritalStatus" placeholder="请选择婚姻状况" clearable>
          <el-option
            v-for="dict in dict.type.hrs_marital_status"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="政治面貌" prop="politicalStatus">
        <el-select v-model="queryParams.politicalStatus" placeholder="请选择政治面貌" clearable>
          <el-option
            v-for="dict in dict.type.hrs_political_status"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="民族" prop="nation">
        <el-select v-model="queryParams.nation" placeholder="请选择民族" clearable>
          <el-option
            v-for="dict in dict.type.hrs_nation"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="籍贯" prop="nativePlace">
        <el-input
          v-model="queryParams.nativePlace"
          placeholder="请输入籍贯"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="现居地址" prop="address">
        <el-input
          v-model="queryParams.address"
          placeholder="请输入现居地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="紧急联系人" prop="emergencyContact">
        <el-input
          v-model="queryParams.emergencyContact"
          placeholder="请输入紧急联系人"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="紧急电话" prop="emergencyPhone">
        <el-input
          v-model="queryParams.emergencyPhone"
          placeholder="请输入紧急联系人电话"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['hrs:employee:search:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table
      v-loading="loading"
      :data="employeeList"
      row-key="employeeId"
      border
    >
      <el-table-column label="人员编号" align="center" prop="employeeCode" />
      <el-table-column label="人员姓名" align="center" prop="employeeName" />
      <el-table-column label="性别" align="center" prop="gender">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.sys_user_sex" :value="scope.row.gender"/>
        </template>
      </el-table-column>
      <el-table-column label="出生日期" align="center" prop="birthday" width="100">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.birthday, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="身份证号" align="center" prop="idCard" width="180" />
      <el-table-column label="手机号码" align="center" prop="phone" width="120" />
      <el-table-column label="邮箱" align="center" prop="email" width="180" />
      <el-table-column label="人员类别" align="center" prop="employeeType">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.hrs_employee_type" :value="scope.row.employeeType"/>
        </template>
      </el-table-column>
      <el-table-column label="部门" align="center" prop="deptName" />
      <el-table-column label="职位" align="center" prop="position" />
      <el-table-column label="入职日期" align="center" prop="entryDate" width="100">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.entryDate, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="状态" align="center" prop="status">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.hrs_employee_status" :value="scope.row.status"/>
        </template>
      </el-table-column>
      <el-table-column label="学历" align="center" prop="education">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.hrs_education" :value="scope.row.education"/>
        </template>
      </el-table-column>
      <el-table-column label="专业" align="center" prop="major" />
      <el-table-column label="毕业院校" align="center" prop="school" />
      <el-table-column label="工作年限" align="center" prop="workYears" width="80" />
      <el-table-column label="婚姻状况" align="center" prop="maritalStatus">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.hrs_marital_status" :value="scope.row.maritalStatus"/>
        </template>
      </el-table-column>
      <el-table-column label="政治面貌" align="center" prop="politicalStatus">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.hrs_political_status" :value="scope.row.politicalStatus"/>
        </template>
      </el-table-column>
      <el-table-column label="民族" align="center" prop="nation">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.hrs_nation" :value="scope.row.nation"/>
        </template>
      </el-table-column>
      <el-table-column label="籍贯" align="center" prop="nativePlace" />
      <el-table-column label="现居地址" align="center" prop="address" />
      <el-table-column label="紧急联系人" align="center" prop="emergencyContact" />
      <el-table-column label="紧急电话" align="center" prop="emergencyPhone" width="120" />
    </el-table>
    
    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />
  </div>
</template>

<script>
import { listEmployeeSearch, exportEmployeeSearch } from "@/api/hrs/employee/search";
import { treeselect } from "@/api/system/dept";
import Treeselect from "@riophae/vue-treeselect";
import "@riophae/vue-treeselect/dist/vue-treeselect.css";

export default {
  name: "EmployeeSearch",
  dicts: ['sys_user_sex', 'hrs_employee_type', 'hrs_employee_status', 'hrs_education', 'hrs_marital_status', 'hrs_political_status', 'hrs_nation'],
  components: { Treeselect },
  data() {
    return {
      // 遮罩层
      loading: true,
      // 显示搜索条件
      showSearch: true,
      // 总条数
      total: 0,
      // 人员综合信息表格数据
      employeeList: [],
      // 部门树选项
      deptOptions: [],
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        employeeCode: null,
        employeeName: null,
        gender: null,
        idCard: null,
        phone: null,
        email: null,
        employeeType: null,
        deptId: null,
        position: null,
        entryDate: null,
        status: null,
        education: null,
        major: null,
        school: null,
        workYears: null,
        maritalStatus: null,
        politicalStatus: null,
        nation: null,
        nativePlace: null,
        address: null,
        emergencyContact: null,
        emergencyPhone: null
      }
    };
  },
  created() {
    this.getList();
    this.getDeptTreeselect();
  },
  methods: {
    /** 查询人员综合信息列表 */
    getList() {
      this.loading = true;
      listEmployeeSearch(this.queryParams).then(response => {
        this.employeeList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    /** 查询部门下拉树结构 */
    getDeptTreeselect() {
      treeselect().then(response => {
        this.deptOptions = response.data;
      });
    },
    /** 转换部门数据结构 */
    normalizer(node) {
      if (node.children && !node.children.length) {
        delete node.children;
      }
      return {
        id: node.id,
        label: node.label,
        children: node.children
      };
    },
    /** 搜索按钮操作 */
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getList();
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('hrs/employee/search/export', {
        ...this.queryParams
      }, `人员综合信息_${new Date().getTime()}.xlsx`);
    }
  }
};
</script> 