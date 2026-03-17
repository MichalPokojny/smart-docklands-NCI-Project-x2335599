# smart-docklands-NCI-Project-x2335599
**Data Structures & Algorithms - Continuous Assessment**

---

## SmartWaste – Dublin Docklands Bin Collection Management System

## About
A Java Swing desktop application built in NetBeans for managing smart waste bin collection in the Dublin Docklands area.

---

## How to Use

### Bins Tab
1. Enter a Bin ID, Location, Fill Level and select a Type
2. Click **Add Bin** to register it in the system
3. Select a row in the table and click **Update Bin** or **Delete Bin** to modify it

### Collection Queue Tab
1. Select a bin from the table and click **Enqueue Bin** to add it to the queue
2. Click **Dequeue Bin** to process and remove the first bin in the queue
3. Click **Peek Next** to view the next bin without removing it

### Maintenance Tab
1. Use **Next Bin** and **Previous Bin** to navigate through registered bins
2. Type a note in the Maintenance Note field and click **Add Note** to save it
3. Click **View Latest** to see the most recent record or **View All Records** to see the full notse list

### Reports Tab
1. Click **Generate Report** to view a full summary of all bins, queue and maintenance records

---

## Features
- Add, update and delete waste bins via a form
- View all registered bins in a table
- Queue bins for collection in order
- Log maintenance records for each bin
- Generate a full system report across all tabs

---

## Data Structures Used
- Singly Linked List – stores the collection route
- Queue – manages bin collection order (FIFO)
- Stack – tracks maintenance records (LIFO)

---

## How to Run
Open the project in NetBeans and run SmartDocklandsApp.java as main class.
