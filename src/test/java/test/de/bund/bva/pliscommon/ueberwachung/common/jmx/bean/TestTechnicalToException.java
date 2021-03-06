/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * The Federal Office of Administration (Bundesverwaltungsamt, BVA)
 * licenses this file to you under the Apache License, Version 2.0 (the
 * License). You may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package test.de.bund.bva.pliscommon.ueberwachung.common.jmx.bean;

import de.bund.bva.pliscommon.exception.service.PlisTechnicalToException;

/**
 * Exception fuer den Test. Es wird eine Exception vom Typ PlisToException benoetigt.
 *
 * @author Capgemini, Marcel Vielsack
 * @version $Id: TestTechnicalToException.java 130451 2015-02-13 16:17:14Z sdm_ahoerning $
 */
public class TestTechnicalToException extends PlisTechnicalToException {

    /**
     * default serial.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Konstruktor gibt Argument nur an Elternklasse weiter.
     * @param message
     *            Nachricht
     * @param ausnahmeId
     *            AusnahmeId
     * @param uniqueId
     *            eindeutige Id
     */
    protected TestTechnicalToException(String message, String ausnahmeId, String uniqueId) {
        super(message, ausnahmeId, uniqueId);
    }

}
