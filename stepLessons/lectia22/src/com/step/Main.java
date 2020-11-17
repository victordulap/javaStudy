package com.step;

import com.step.data.CopyFiles;
import com.step.data.Serialize.DataInputStreamTest;
import com.step.data.Serialize.DataOutputStreamTest;
import com.step.data.Serialize.ObjectInputStreamTest;
import com.step.data.Serialize.ObjectOutputStreamTest;

import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) {
//        CopyFiles.copyFile();
//        DataOutputStreamTest.run();
//        DataInputStreamTest.run();
        ObjectOutputStreamTest.run();
        ObjectInputStreamTest.run();
    }
}
