package com.ovpnals.boot;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Factory class to get an instance of the configure {@link com.ovpnals.boot.Repository}.
 * <p>
 * If the repository has already been created then the same instance will be
 * returned.
 * <p>
 * The repository implementation to use is determined by the value of
 * the <i>ovpnals.repositoryClass</i> system property that should contain
 * the full qualified class name to use.
 * 
 * @see com.ovpnals.boot.LocalRepository
 */
public class RepositoryFactory {
    static Repository instance;
    static Log log = LogFactory.getLog(RepositoryFactory.class);

    /**
     * Get an instance of the configured repository.
     * 
     * @return repository
     */
    public static Repository getRepository() {
        if (instance != null)
            return instance;
        try {
            if (SystemProperties.get("ovpnals.repositoryClass") != null) {
                instance = (Repository) Class.forName(SystemProperties.get("ovpnals.repositoryClass")).newInstance();
            } else
                instance = new LocalRepository();
        } catch (Exception e) {
            log.error("Failed to initialize repository", e);
            return null;
        }
        return instance;
    }
}
