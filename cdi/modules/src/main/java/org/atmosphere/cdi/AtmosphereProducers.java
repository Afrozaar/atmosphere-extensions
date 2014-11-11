/*
* Copyright 2014 Jeanfrancois Arcand
*
* Licensed under the Apache License, Version 2.0 (the "License"); you may not
* use this file except in compliance with the License. You may obtain a copy of
* the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
* WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
* License for the specific language governing permissions and limitations under
* the License.
*/
package org.atmosphere.cdi;

import org.atmosphere.cpr.AtmosphereConfig;
import org.atmosphere.cpr.AtmosphereFramework;
import org.atmosphere.cpr.AtmosphereResourceFactory;
import org.atmosphere.cpr.AtmosphereResourceSessionFactory;
import org.atmosphere.cpr.BroadcasterFactory;
import org.atmosphere.cpr.MetaBroadcaster;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

/**
 * Atmosphere Internal Object Injection
 */
@ApplicationScoped
public class AtmosphereProducers {

    private AtmosphereConfig config;

    public void configure(AtmosphereConfig config) {
        this.config = config;
    }

    @Produces
    public BroadcasterFactory getBroadcasterFactory() {
        return config.getBroadcasterFactory();
    }

    @Produces
    public AtmosphereResourceFactory getAtmosphereResourceFactory() {
        return config.resourcesFactory();
    }

    @Produces
    public AtmosphereResourceSessionFactory getAtmosphereResourceSessionFactory() {
        return config.sessionFactory();
    }

    @Produces
    public AtmosphereConfig getAtmosphereConfig() {
        return config;
    }

    @Produces
    public AtmosphereFramework getAtmosphereFramework() {
        return config.framework();
    }

    @Produces
    public MetaBroadcaster getMetaBroadcaster() {
        return config.metaBroadcaster();
    }

}
