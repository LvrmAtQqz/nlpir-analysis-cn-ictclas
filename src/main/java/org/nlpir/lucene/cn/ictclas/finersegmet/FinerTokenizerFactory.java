package org.nlpir.lucene.cn.ictclas.finersegmet;

import java.util.Map;

import org.apache.lucene.analysis.Tokenizer;
import org.apache.lucene.analysis.util.TokenizerFactory;
import org.apache.lucene.util.AttributeFactory;

public class FinerTokenizerFactory  extends TokenizerFactory {

	public FinerTokenizerFactory(Map<String, String> args) {
		super(args);
		if (!args.isEmpty()) {
			throw new IllegalArgumentException("Unknown parameters: " + args);
		}
	}

	/**
	 * 分词初始化
	 * 
	 * @param data
	 *            词典路径
	 * @param encoding
	 *            编码 0：GBK；1：UTF-8
	 * @param sLicenceCode
	 *            授权码，默认为""
	 * @param userDict
	 *            用户词典文件
	 * @param nOverwrite
	 *            用户词典引入方式
	 */
	public Tokenizer create(AttributeFactory factory, String data, int encoding, String sLicenceCode, String userDict,
			boolean bOverwrite) {
		return new FinerTokenizer(factory, data, encoding, sLicenceCode, userDict, bOverwrite);
	}

	@Override
	public Tokenizer create(AttributeFactory factory) {
		return new FinerTokenizer(factory);
	}
}
