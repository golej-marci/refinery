package tools.refinery.store.model.representation;

import tools.refinery.store.map.ContinousHashProvider;

public abstract class DataRepresentation<K, V> {
	protected final ContinousHashProvider<K> hashProvider;
	protected final V defaultValue;

	protected DataRepresentation(ContinousHashProvider<K> hashProvider,	V defaultValue) {
		this.hashProvider = hashProvider;
		this.defaultValue = defaultValue;
	}
	
	public abstract String getName();
	
	public ContinousHashProvider<K> getHashProvider() {
		return hashProvider;
	}
	public abstract boolean isValidKey(K key);

	public V getDefaultValue() {
		return defaultValue;
	}
}
