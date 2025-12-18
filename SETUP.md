# Setup Instructions for Simples Calc

## ⚠️ Important: Fixing Clone Issues

If you encountered this error when cloning:

```
invalid path 'app/src/main/res/values/<?xml version="1.0" encoding="utf-8"?> ...'
unable to checkout working tree
```

This is due to a bug in GitHub's web interface when creating files in deeply nested directories. Follow these steps to fix it:

### Solution 1: Create strings.xml After Cloning (RECOMMENDED)

1. Clone the repository:
   ```bash
   git clone https://github.com/rogersneves/simples-calc.git
   cd simples-calc
   ```

2. If you get the checkout error, run:
   ```bash
   git restore --source=HEAD :/
   ```

3. Create the missing strings.xml file:
   ```bash
   mkdir -p app/src/main/res/values
   ```

4. Create `app/src/main/res/values/strings.xml` with this content:
   ```xml
   <?xml version="1.0" encoding="utf-8"?>
   <resources>
       <string name="app_name">Simples Calc</string>
   </resources>
   ```

5. Create `app/src/main/res/layout/activity_main.xml` with this content:
   ```xml
   <?xml version="1.0" encoding="utf-8"?>
   <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
       android:layout_width="match_parent"
       android:layout_height="match_parent"
       android:orientation="vertical"
       android:padding="16dp"
       android:background="@android:color/white">

       <TextView
           android:id="@+id/display"
           android:layout_width="match_parent"
           android:layout_height="80dp"
           android:text="0"
           android:textSize="48sp"
           android:textAlignment="textEnd"
           android:gravity="center_vertical|end"
           android:paddingEnd="16dp"
           android:background="#f0f0f0"
           android:layout_marginBottom="16dp" />

       <GridLayout
           android:layout_width="match_parent"
           android:layout_height="match_parent"
           android:columnCount="4"
           android:rowCount="5">

           <Button android:id="@+id/btnClear" android:text="C" android:layout_row="0" android:layout_column="0" android:layout_columnWeight="1" android:layout_gravity="fill" />
           <Button android:id="@+id/btnDivide" android:text="/" android:layout_row="0" android:layout_column="1" android:layout_columnWeight="1" android:layout_gravity="fill" />
           <Button android:id="@+id/btnMultiply" android:text="*" android:layout_row="0" android:layout_column="2" android:layout_columnWeight="1" android:layout_gravity="fill" />
           <Button android:id="@+id/btnSubtract" android:text="-" android:layout_row="0" android:layout_column="3" android:layout_columnWeight="1" android:layout_gravity="fill" />

           <Button android:id="@+id/btn7" android:text="7" android:layout_row="1" android:layout_column="0" android:layout_columnWeight="1" android:layout_gravity="fill" />
           <Button android:id="@+id/btn8" android:text="8" android:layout_row="1" android:layout_column="1" android:layout_columnWeight="1" android:layout_gravity="fill" />
           <Button android:id="@+id/btn9" android:text="9" android:layout_row="1" android:layout_column="2" android:layout_columnWeight="1" android:layout_gravity="fill" />
           <Button android:id="@+id/btnAdd" android:text="+" android:layout_row="1" android:layout_column="3" android:layout_columnWeight="1" android:layout_gravity="fill" />

           <Button android:id="@+id/btn4" android:text="4" android:layout_row="2" android:layout_column="0" android:layout_columnWeight="1" android:layout_gravity="fill" />
           <Button android:id="@+id/btn5" android:text="5" android:layout_row="2" android:layout_column="1" android:layout_columnWeight="1" android:layout_gravity="fill" />
           <Button android:id="@+id/btn6" android:text="6" android:layout_row="2" android:layout_column="2" android:layout_columnWeight="1" android:layout_gravity="fill" />
           <Button android:id="@+id/btnEquals" android:text="=" android:layout_row="2" android:layout_column="3" android:layout_columnWeight="1" android:layout_gravity="fill" />

           <Button android:id="@+id/btn1" android:text="1" android:layout_row="3" android:layout_column="0" android:layout_columnWeight="1" android:layout_gravity="fill" />
           <Button android:id="@+id/btn2" android:text="2" android:layout_row="3" android:layout_column="1" android:layout_columnWeight="1" android:layout_gravity="fill" />
           <Button android:id="@+id/btn3" android:text="3" android:layout_row="3" android:layout_column="2" android:layout_columnWeight="1" android:layout_gravity="fill" />
           <Button android:id="@+id/btnDot" android:text="." android:layout_row="3" android:layout_column="3" android:layout_columnWeight="1" android:layout_gravity="fill" />

           <Button android:id="@+id/btn0" android:text="0" android:layout_row="4" android:layout_column="0" android:layout_columnWeight="2" android:layout_gravity="fill" />

       </GridLayout>

   </LinearLayout>
   ```

6. Stage and commit your changes:
   ```bash
   git add .
   git commit -m "Fix: Add missing resource files"
   ```

### Solution 2: Using Git Commands

If you're comfortable with Git commands, you can also:

```bash
git clone --no-checkout https://github.com/rogersneves/simples-calc.git
cd simples-calc

# Create the directory structure
mkdir -p app/src/main/res/values
mkdir -p app/src/main/res/layout

# Create the files with the content above
# ... then commit and push
```

## Building the App

Once the files are in place:

1. Open the project in Android Studio
2. Build → Make Project
3. Run → Run 'app'

## Troubleshooting

- If you still have issues, delete the cloned folder and try again
- Make sure you're using Git 2.25 or later
- On Windows, you may need to enable `core.longpaths` in Git config

## References

- [GitHub Issue: Long Path Names](https://github.com/microsoft/Git-Credential-Manager-for-Windows/issues/1099)
- [Android Developer Guide](https://developer.android.com/)
