# User Stories

## Admin User Stories

### Title:
As an admin, I want to reset a doctor's password, so that they can regain access if they forget it.

**Acceptance Criteria:**
- Admin can search and select a doctor
- Reset option sends a secure reset link or temporary password
- Action is logged for audit purposes

**Priority:** High
**Story Points:** 3
**Notes:**
- Ensure security with time-limited reset links

---

### Title:
As an admin, I want to generate a monthly performance report, so that I can review system usage and activity.

**Acceptance Criteria:**
- Admin can select report type and time range
- Report includes user activity stats
- Export option for CSV or PDF

**Priority:** Medium
**Story Points:** 5
**Notes:**
- Useful for quarterly reviews and audits

---

### Title:
As an admin, I want to view a log of recent user actions, so that I can monitor activity and troubleshoot issues.

**Acceptance Criteria:**
- Logs show user type, action, timestamp
- Searchable and filterable by user or date
- Entries are read-only

**Priority:** Medium
**Story Points:** 3
**Notes:**
- Include login, profile updates, and appointment changes

---

### Title:
As an admin, I want to deactivate user accounts, so that inactive users no longer access the system.

**Acceptance Criteria:**
- Admin can toggle user active/inactive status
- Inactive users are blocked from login
- Action is reversible

**Priority:** High
**Story Points:** 2
**Notes:**
- Display reason for deactivation

---

### Title:
As an admin, I want to assign roles to users, so that permissions are enforced throughout the system.

**Acceptance Criteria:**
- Admin can assign roles like doctor, patient, or admin
- UI reflects role-specific features
- Changes take effect immediately

**Priority:** High
**Story Points:** 3
**Notes:**
- Use role-based access control (RBAC)

---

## Patient User Stories

### Title:
As a patient, I want to upload medical files before an appointment, so that the doctor has relevant context.

**Acceptance Criteria:**
- Upload option available during appointment booking
- Accepted formats: PDF, JPG, PNG
- Files linked securely to appointment

**Priority:** Medium
**Story Points:** 4
**Notes:**
- Add virus scan before storing file

---

### Title:
As a patient, I want to receive SMS reminders, so that I don't forget my upcoming appointments.

**Acceptance Criteria:**
- Patient can opt-in for SMS reminders
- Reminder sent 24 hours before appointment
- Includes appointment time and location

**Priority:** High
**Story Points:** 3
**Notes:**
- Use third-party SMS gateway like Twilio

---

### Title:
As a patient, I want to cancel an appointment, so that I can free up the slot if I can't attend.

**Acceptance Criteria:**
- Cancellation option available on dashboard
- Confirmation required before cancelling
- Cancelled status is saved in system

**Priority:** Medium
**Story Points:** 2
**Notes:**
- Send cancellation email to doctor

---

### Title:
As a patient, I want to update my contact details, so that the clinic can reach me if needed.

**Acceptance Criteria:**
- Editable profile form for phone and email
- Form validates inputs
- Data saved to backend

**Priority:** High
**Story Points:** 2
**Notes:**
- Audit changes to contact info

---

### Title:
As a patient, I want to provide feedback after appointments, so that I can help improve the service.

**Acceptance Criteria:**
- Feedback form appears after appointment is marked completed
- Rating and comment fields included
- Doctor does not see feedback directly

**Priority:** Medium
**Story Points:** 3
**Notes:**
- Use feedback for reporting and quality checks

---

## Doctor User Stories

### Title:
As a doctor, I want to write visit summaries after each appointment, so that I can keep track of treatment history.

**Acceptance Criteria:**
- Text area available on appointment details page
- Summary saved and timestamped
- Editable within 24 hours of entry

**Priority:** High
**Story Points:** 3
**Notes:**
- Prevent edits after 24h to maintain record integrity

---

### Title:
As a doctor, I want to filter appointments by status, so that I can quickly view pending or completed ones.

**Acceptance Criteria:**
- Filter options available: All, Pending, Completed, Cancelled
- UI updates appointment list dynamically
- Default view shows today's schedule

**Priority:** Medium
**Story Points:** 2
**Notes:**
- Improve UX with clear status badges

---

### Title:
As a doctor, I want to send post-visit instructions to patients, so that they follow up properly.

**Acceptance Criteria:**
- Text input for visit instructions
- Patient receives notification
- Instructions stored with appointment record

**Priority:** High
**Story Points:** 3
**Notes:**
- Allow updates within 24 hours

---

### Title:
As a doctor, I want to search my past appointments, so that I can review case history.

**Acceptance Criteria:**
- Search by patient name, date, or status
- Results show appointment and summary
- Access restricted to own patients

**Priority:** Medium
**Story Points:** 3
**Notes:**
- Optimize queries for performance

---

### Title:
As a doctor, I want to download patient reports, so that I can refer offline if needed.

**Acceptance Criteria:**
- Download button on patient profile
- Report includes medical history and appointments
- Available in PDF format

**Priority:** Low
**Story Points:** 2
**Notes:**
- Secure download with access logging

---

