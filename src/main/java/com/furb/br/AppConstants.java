package com.furb.br;

import java.util.concurrent.TimeUnit;

public interface AppConstants {

	public static final long KILL_COORDINATOR_INTERVAL = TimeUnit.MINUTES.toMillis(1);
	public static final String KILL_COORDINATOR_TIMER = "KILL_COORDINATOR_TIMER";
	public static final String KILL_COORDINATOR_METHOD = "killCoordinator";
	
	public static final long CREATE_PROCESS_INTERVAL = TimeUnit.SECONDS.toMillis(40);
	public static final String CREATE_PROCESS_TIMER = "CREATE_PROCESS_TIMER";
	public static final String CREATE_PROCESS_METHOD = "createProcess";
	
	// IN SECONDS
	public static final short CREATE_NODE_INIT = 10;
	public static final short CREATE_NODE_LIMIT = 26;
	
	// IN MILLIS
	public static final short LOCK_RESOURCE_INIT = 5000;
	public static final short LOCK_RESOURCE_LIMIT = 15000;
	
}
