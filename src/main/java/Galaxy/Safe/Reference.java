package Galaxy.Safe;

public class Reference {

	public static final String MOD_ID = "galaxysafe";
	public static final String NAME = "Galaxy's Safe";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSIONS = "[1.10.2]";

	public static final String CLIENT_PROXY_CLASS = "Galaxy.Safe.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "Galaxy.Safe.proxy.ClientProxy";

	public static enum SafeItems {
		Safe("safe", "ItemSafe");

		private String unlocalizedName;
		private String registryName;

		SafeItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}

		public String getRegistryName() {
			return registryName;
		}

		public String getUnlocalizedName() {
			return unlocalizedName;
		}
	}
	
	public static enum SafeBlocks {
		SAFE("safe", "BlockSafe");

		private String unlocalizedName;
		private String registryName;

		SafeBlocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}

		public String getRegistryName() {
			return registryName;
		}

		public String getUnlocalizedName() {
			return unlocalizedName;
		}
	}
}
