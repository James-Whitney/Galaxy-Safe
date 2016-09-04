package Galaxy.Safe;

public class Reference {

	public static final String MOD_ID = "GalaxySafe";
	public static final String NAME = "Galaxy's Safe";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSIONS = "[1.10.2]";

	public static final String CLIENT_PROXY_CLASS = "Jekyll.tutorial.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "Jekyll.tutorial.proxy.ClientProxy";

	public static enum TutorialItems {
		CHEESE("cheese", "ItemCheese"), CRACKER("cracker", "ItemCracker");

		private String unlocalizedName;
		private String registryName;

		TutorialItems(String unlocalizedName, String registryName) {
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

	public static enum TutorialBlocks {
		CHEESE("cheese", "BlockCheese"), JAR("jar", "BlockJar");

		private String unlocalizedName;
		private String registryName;

		TutorialBlocks(String unlocalizedName, String registryName) {
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
