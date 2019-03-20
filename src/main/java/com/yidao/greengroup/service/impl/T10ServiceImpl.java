package com.yidao.greengroup.service.impl;

import com.yidao.greengroup.dao.T10Mapper;
import com.yidao.greengroup.po.Enginer.*;
import com.yidao.greengroup.service.T10Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: huangtao
 * @description:
 * @date: 2019-03-11 10:43
 * @version: $version$
 */
@Service
public class T10ServiceImpl implements T10Service {
	@Autowired
	T10Mapper t10Mapper1;
	@Override
	public T10 findT10Data() {

		return t10Mapper1.findT10Data();
	}

	@Override
	public T11 findT11Data() {
		return t10Mapper1.findT11Data();
	}

	@Override
	public T15 findT15Data() {
		return t10Mapper1.findT15Data();
	}

	@Override
	public T16 findT16Data() {
		return t10Mapper1.findT16Data();
	}

	@Override
	public T17 findT17Data() {
		return t10Mapper1.findT17Data();
	}

	@Override
	public T18 findT18Data() {
		return t10Mapper1.findT18Data();
	}

	@Override
	public T19 findT19Data() {
		return t10Mapper1.findT19Data();
	}

	@Override
	public T21 findT21Data() {
		return t10Mapper1.findT21Data();
	}

	@Override
	public T22 findT22Data() {
		return t10Mapper1.findT22Data();
	}

	@Override
	public T24 findT24Data() {
		return t10Mapper1.findT24Data();
	}

	@Override
	public T26 findT26Data() {
		return t10Mapper1.findT26Data();
	}

	@Override
	public T27 findT27Data() {
		return t10Mapper1.findT27Data();
	}

	@Override
	public T28 findT28Data() {
		return t10Mapper1.findT28Data();
	}

	@Override
	public T29 findT29Data() {
		return t10Mapper1.findT29Data();
	}

	@Override
	public T30 findT30Data() {
		return t10Mapper1.findT30Data();
	}

	@Override
	public T40 findT40Data() {
		return t10Mapper1.findT40Data();
	}

	@Override
	public T41 findT41Data() {
		return t10Mapper1.findT41Data();
	}

	@Override
	public T42 findT42Data() {
		return t10Mapper1.findT42Data();
	}

	@Override
	public T43 findT43Data() {
		return t10Mapper1.findT43Data();
	}

	@Override
	public T44 findT44Data() {
		return t10Mapper1.findT44Data();
	}
}
