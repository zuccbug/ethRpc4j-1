package com.umpay.ethrpc4j.methods;

import static com.umpay.ethrpc4j.databind.Converters.*;

import java.util.List;
import java.util.Map;

import com.umpay.ethrpc4j.rpc.RpcProvider;
import com.umpay.ethrpc4j.types.Block;
import com.umpay.ethrpc4j.types.Log;
import com.umpay.ethrpc4j.types.Syncing;
import com.umpay.ethrpc4j.types.Transaction;

public class EthMethods extends MethodsBase {

	private static final String METHOD_PREFIX = "eth";

	public EthMethods(RpcProvider provider) {
		super(METHOD_PREFIX, provider);
	}

	public Long protocolVersion() throws Exception {
		return callQuantity("protocolVersion");
	}

	public Syncing syncing() throws Exception {
		return (Syncing) call("syncing", null, Syncing.class);
	}

	public String coinbase() throws Exception {
		return callString("coinbase");
	}

	public Boolean mining() throws Exception {
		return callBoolean("mining");
	}

	public Long hashrate() throws Exception {
		return callQuantity("hashrate", null);
	}

	public Long gasPrice() throws Exception {
		return callQuantity("gasPrice");
	}

	@SuppressWarnings("unchecked")
	public List<String> accounts() throws Exception {
		return (List<String>) call("accounts", null, List.class);
	}

	public Long blockNumber() throws Exception {
		return callQuantity("blockNumber");
	}

	public Long getBalance(String address) throws Exception {
		return callQuantity("getBalance", new Object[] { address });
	}

	public Long getBalance(String address, String blockHash) throws Exception {
		return callQuantity("getBalance", new Object[] { address, blockHash });
	}

	public String getStorageAt(String address, String storageIdx, String blockId) throws Exception {
		return callString("getStorageAt", new Object[] { address, storageIdx, blockId });
	}

	public Long getTransactionCount(String address, Long blockNumber) throws Exception {
		return callQuantity("getTransactionCount", new Object[] { address, blockNumber });
	}

	public Long getTransactionCount(String address, String tag) throws Exception {
		return callQuantity("getTransactionCount", new Object[] { address, tag });
	}

	public Long getBlockTransactionCountByHash(String blockHash) throws Exception {
		return callQuantity("getBlockTransactionCountByHash", new Object[] { blockHash });
	}

	public Long getBlockTransactionCountByNumber(Long blockNumber) throws Exception {
		return callQuantity("getBlockTransactionCountByNumber", new Object[] { blockNumber });
	}

	public Long getBlockTransactionCountByNumber(String tag) throws Exception {
		return callQuantity("getBlockTransactionCountByNumber", new Object[] { tag });
	}

	public Long getUncleCountByBlockHash(String blockHash) throws Exception {
		return callQuantity("getUncleCountByBlockHash", new Object[] { blockHash });
	}

	public Long getUncleCountByBlockNumber(Long blockNumber) throws Exception {
		return callQuantity("getUncleCountByBlockNumber", new Object[] { blockNumber });
	}

	public Long getUncleCountByBlockNumber(String tag) throws Exception {
		return callQuantity("getUncleCountByBlockNumber", new Object[] { tag });
	}

	public String getCode(String addr, String bnOrId) throws Exception {
		return callString("getCode", new Object[] { addr, bnOrId });
	}

	public String sign(String addr, String data) throws Exception {
		return callString("sign", new Object[] { addr, data });
	}

	public String sendTransaction(String from, String to, String gas, String gasPrice, String value, String data,
			String nonce) throws Exception {
		return callString("sendTransaction", new Object[] { from, to, gas, gasPrice, value, data, nonce });
	}
	public String sendTransaction(String from, String to, String gas, String gasPrice, String value, String data) throws Exception {
		return callString("sendTransaction", new Object[] { from, to, gas, gasPrice, value, data });
	}
	
	public String sendTransaction(Map parma) throws Exception {
		return callString("sendTransaction", new Object[] { parma });
	}
	

	public String sendRawTransaction(String rawData) throws Exception {
		return callString("sendRawTransaction", new Object[] { rawData });
	}

	public String call(String from, String to, String gas, String gasPrice, String value, String data)
			throws Exception {
		return callString("call", new Object[] { from, to, gas, gasPrice, value, data });
	}
	
	public String call(Map map)
			throws Exception {
		return callString("call", new Object[] {map,"latest"});
	}

	public Long estimateGas(Long from, Long to, Long gas, Long gasPrice, Long value, Long data) throws Exception {
		return callQuantity("estimateGas", new Object[] { from, to, gas, gasPrice, value, data });
	}

	public Block getBlockByHash(String blockHash, Boolean fullTransactionObjects) throws Exception {
		return (Block) call("getBlockByHash", new Object[] { blockHash, fullTransactionObjects }, Block.class);
	}

	public Block getBlockByNumber(String bnOrId, Boolean fullTransactionObjects) throws Exception {
		return (Block) call("getBlockByNumber", new Object[] { bnOrId, fullTransactionObjects }, Block.class);
	}

	public Transaction getTransactionByHash(String transactionHash) throws Exception {
		return (Transaction) call("getTransactionByHash", new Object[] { transactionHash }, Transaction.class);
	}

	public Transaction getTransactionByBlockHashAndIndex(String blockHash, String index) throws Exception {
		return (Transaction) call("getTransactionByBlockHashAndIndex", new Object[] { blockHash, index },
				Transaction.class);
	}

	public Transaction getTransactionByBlockNumberAndIndex(String bnOrId, String index) throws Exception {
		return (Transaction) call("getTransactionByBlockNumberAndIndex", new Object[] { bnOrId, index },
				Transaction.class);
	}

	public Map getTransactionReceipt(String transactionHash) throws Exception {
		return (Map) call("getTransactionReceipt", new Object[] { transactionHash }, Map.class);
	}

	public Block getUncleByBlockHashAndIndex(String blockHash, String uncleIdx) throws Exception {
		return (Block) call("getUncleByBlockHashAndIndex", new Object[] { blockHash, uncleIdx }, Block.class);
	}

	public Block getUncleByBlockNumberAndIndex(String blockId, String uncleIdx) throws Exception {
		return (Block) call("getUncleByBlockNumberAndIndex", new Object[] { blockId, uncleIdx }, Block.class);
	}

	@SuppressWarnings("unchecked")
	public List<String> getCompilers() throws Exception {
		return (List<String>) call("getCompilers", null, List.class);
	}

	public byte[] compileLLL(String contract) throws Exception {
		return (byte[]) call("compileLLL", new Object[] { contract }, byte[].class);
	}

	public Map compileSolidity(String contract) throws Exception {
		return (Map) call("compileSolidity", new Object[] { contract }, Map.class);
	}

	public byte[] compileSerpent(String contract) throws Exception {
		return (byte[]) call("compileSerpent", new Object[] { contract }, byte[].class);
	}

	public Long newFilter(String fromBlock, String toBlock, String address, String[] topics) throws Exception {
		return callQuantity("newFilter", new Object[] { fromBlock, toBlock, address, topics });
	}

	public Long newBlockFilter() throws Exception {
		return callQuantity("newBlockFilter");
	}

	public Long newPendingTransactionFilter() throws Exception {
		return callQuantity("newPendingTransactionFilter");
	}

	public Boolean uninstallFilter(Long filterId) throws Exception {
		return callBoolean("uninstallFilter", new Object[] { quantityToHex(filterId) });
	}

	@SuppressWarnings("unchecked")
	public List<Log> getFilterChanges(Long filterId) throws Exception {
		return (List<Log>) call("getFilterChanges", new Object[] { quantityToHex(filterId) }, List.class);
	}

	@SuppressWarnings("unchecked")
	public List<Log> getFilterLogs(Long filterId) throws Exception {
		return (List<Log>) call("getFilterLogs", new Object[] { quantityToHex(filterId) }, List.class);
	}

	@SuppressWarnings("unchecked")
	public List<Log> getLogs(String fromBlock, String toBlock, String address, String[] topics) throws Exception {
		return (List<Log>) call("getLogs", new Object[] { fromBlock, toBlock, address, topics }, List.class);
	}

	public String[] getWork() throws Exception {
		return (String[]) call("getWork", null, String[].class);
	}

	public Boolean submitWork(String nonce, String powHash, String mixDigest) throws Exception {
		return callBoolean("submitWork", new Object[] { nonce, powHash, mixDigest });
	}

	public Boolean submitHashrate(String hashRate, String clientId) throws Exception {
		return callBoolean("submitHashrate", new Object[] { hashRate, clientId });
	}

}
