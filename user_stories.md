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

