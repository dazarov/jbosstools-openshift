/*******************************************************************************
 * Copyright (c) 2011 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package org.jboss.tools.openshift.express.internal.ui.wizard;




/**
 * @author André Dietisheim <adietish@redhat.com>
 */
public class ImportExistingApplicationWizardModel extends AbstractOpenShiftApplicationWizardModel {

	public ImportExistingApplicationWizardModel() {
		dataModel.put(NEW_PROJECT, false);
	}

}