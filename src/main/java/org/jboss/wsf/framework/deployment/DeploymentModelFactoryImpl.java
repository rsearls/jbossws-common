/*
 * JBoss, Home of Professional Open Source
 * Copyright 2005, JBoss Inc., and individual contributors as indicated
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.wsf.framework.deployment;

import org.jboss.wsf.spi.deployment.DeploymentModelFactory;
import org.jboss.wsf.spi.deployment.Deployment;
import org.jboss.wsf.spi.deployment.Service;
import org.jboss.wsf.spi.deployment.Endpoint;

/**
 * @author Heiko.Braun@jboss.com
 *         Created: Jul 18, 2007
 */
public class DeploymentModelFactoryImpl extends DeploymentModelFactory
{
   public Deployment createDeployment(String simpleName, ClassLoader initialLoader)
   {
      return new BasicDeployment(simpleName, initialLoader);
   }

   public Service createService()
   {
      return new BasicService();
   }

   public Endpoint createEndpoint()
   {
      return new BasicEndpoint();
   }
}