package amikth.sample.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import amikth.common.dao.AbstractDAO;

@Repository("sampleDAO")
public class SampleDAO extends AbstractDAO{

	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectBoardList(Map<String, Object> map) throws Exception{
		return (List<Map<String, Object>>)selectList("sample.selectBoardList", map);
	}
	
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectFileList(Map<String, Object> map) throws Exception{
	    return (List<Map<String, Object>>)selectList("sample.selectFileList", map);
	}
	
	public void insertBoard(Map<String, Object> map) throws Exception{
		insert("sample.insertBoard", map);
	}
	
	public void insertFile(Map<String, Object> map) throws Exception{
	    insert("sample.insertFile", map);
	}
	
	public void updateBoard(Map<String, Object> map) throws Exception{
	    update("sample.updateBoard", map);
	}
	
	public void updateHitCnt(Map<String,Object>map) throws Exception{
		update("sample.updateHitCnt", map);
	}
	
	public void deleteBoard(Map<String, Object> map) throws Exception{
	    update("sample.deleteBoard", map);
	}
	
	public void deleteFileList(Map<String,Object> map) throws Exception{
		update("sample.deleteFileList", map);
	}
	
	public void updateFile(Map<String, Object> map) throws Exception{
		System.out.println(" IDX>> "+ map.get("IDX"));
		update("sample.updateFile", map);
	}
	
	@SuppressWarnings("unchecked")
	public Map<String, Object> selectBoardDetail(Map<String, Object> map) throws Exception{
	    return (Map<String, Object>) selectOne("sample.selectBoardDetail", map);
	}

}
