
# Work Task Development Rules

## 🚨 CRITICAL RULE - READ FIRST 🚨

**NEVER mark the current task as complete in the work spec document.**
- You can mark PREVIOUS tasks complete when starting a new task
- You NEVER mark the CURRENT task complete
- Task completion happens when the human asks for the next task

---

## Begin

When asked to begin:
1. Interpret that as "implement task 1" and follow the Task N rules below.

## Next Task

When asked to implement the next task:
1. Find the first unchecked task in the work spec (this is the task you just finished)
2. Mark that completed task as complete in the work spec document
3. Implement the next task in sequence
4. Follow the Task N implementation rules below

## Task N Implementation

When implementing Task N:

### Step 1: Mark Previous Task Complete (if applicable)
- **IF** implementing "next task": Mark the just-completed task as complete in work spec
- **IF** implementing "task 1": Skip this step (no previous task exists)

### Step 2: Implement Current Task
- Read the task requirements carefully
- Implement all code changes needed
- Test for linter errors if applicable

### Step 3: Stop and Wait
- **DO NOT** mark Task N as complete in the work spec
- **DO NOT** proceed to the next task
- **DO NOT** update current task checkboxes
- Simply stop and wait for user authorization

### Step 4: During Implementation
- When asked questions, do not make changes unless explicitly instructed
- Focus only on the current task requirements

---

## 📋 Summary Checklist

For each task implementation:
- [ ] Mark previous task complete (if applicable)
- [ ] Implement current task fully
- [ ] Stop and wait
- [ ] ❌ DO NOT mark current task complete

### Why This Rule Exists
The human controls task progression. Marking the current task complete would signal the work is finished and reviewed, which only the human can determine.