package bai_thi_module.controller;

import bai_thi_module.commons.FileUtils;
import bai_thi_module.commons.InputKeyboard;
import bai_thi_module.models.ExtraProduct;
import bai_thi_module.models.ImportProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerProduct {
    public final String COMMA = ",";
    Input input = new Input();
    int id;
    String codeProduct;
    String nameProduct;
    String priceProduct;
    String amountProduct;
    String nameProducerProduct;
    String priceExtra;
    String countryExtra;
    String priceImport;
    String cityImport;
    String taxImport;
    boolean flag = false;

    public final String FILE_NAME_EXTRA = "E:\\App Codegym\\C0720G1-TruongQuocTrung\\Module 2\\src\\bai_thi_module\\data\\extra.csv";
    public final String FILE_NAME_IMPORT = "E:\\App Codegym\\C0720G1-TruongQuocTrung\\Module 2\\src\\bai_thi_module\\data\\import.csv";
    public List<String> stringList = new ArrayList<>();
    public List<ExtraProduct> extraProductList = new ArrayList<>();
    public List<ImportProduct> importProductList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void readAllFileExtra() {
        stringList = FileUtils.readFile(FILE_NAME_EXTRA);
        extraProductList = new ArrayList<>();
        for (String line : stringList) {
            String[] stringSplit = line.split(COMMA);
            ExtraProduct extraProduct = new ExtraProduct(Integer.parseInt(stringSplit[0]), stringSplit[1], stringSplit[2], stringSplit[3], stringSplit[4], stringSplit[5], stringSplit[6], stringSplit[7]);
            extraProductList.add(extraProduct);
        }
    }

    public void readAllFileImport() {
        stringList = FileUtils.readFile(FILE_NAME_IMPORT);
        importProductList = new ArrayList<>();
        for (String line : stringList) {
            String[] stringSplit = line.split(COMMA);
            ImportProduct importProduct = new ImportProduct(Integer.parseInt(stringSplit[0]), stringSplit[1], stringSplit[2], stringSplit[3], stringSplit[4], stringSplit[5], stringSplit[6], stringSplit[7], stringSplit[8]);
            importProductList.add(importProduct);
        }
    }

    public void addProductExtra() {
        id = input.inputIdAutoExtra();
        codeProduct = input.inputCodeProduct();
        nameProduct = input.inputNameProduct();
        priceProduct = input.inputPriceProduct();
        amountProduct = input.inputAmountProduct();
        nameProducerProduct = input.inputProducerProduct();
        priceExtra = input.inputPriceExtraProduct();
        countryExtra = input.inputCountryImportProduct();

        ExtraProduct extraProduct = new ExtraProduct(id, codeProduct, nameProduct, priceProduct, amountProduct, nameProducerProduct, priceExtra, countryExtra);

        String line = extraProduct.getId() + COMMA +
                extraProduct.getCodeProduct() + COMMA +
                extraProduct.getNameProduct() + COMMA +
                extraProduct.getPriceProduct() + COMMA +
                extraProduct.getAmountProduct() + COMMA +
                extraProduct.getNameProducerProduct() + COMMA +
                extraProduct.getPriceExtra() + COMMA +
                extraProduct.getCountryExtra();
        stringList = FileUtils.readFile(FILE_NAME_EXTRA);
        stringList.add(line);

        FileUtils.writeFile(FILE_NAME_EXTRA, stringList);
        System.out.println("Thêm thành công!!!");
    }

    public void addProductImport() {
        id = input.inputIdAutoImport();
        codeProduct = input.inputCodeProduct();
        nameProduct = input.inputNameProduct();
        priceProduct =  input.inputPriceProduct();
        amountProduct = input.inputAmountProduct();
        nameProducerProduct = input.inputProducerProduct();
        priceImport = input.inputPriceImportProduct();
        cityImport = input.inputCityImportProduct();
        taxImport = input.inputTaxImportProduct();

        ImportProduct importProduct = new ImportProduct(id, codeProduct, nameProduct, priceProduct, amountProduct, nameProducerProduct, priceImport, cityImport, taxImport);

        String line = importProduct.getId() + COMMA +
                importProduct.getCodeProduct() + COMMA +
                importProduct.getNameProduct() + COMMA +
                importProduct.getPriceProduct() + COMMA +
                importProduct.getAmountProduct() + COMMA +
                importProduct.getNameProducerProduct() + COMMA +
                importProduct.getPriceImport() + COMMA +
                importProduct.getCityImport() + COMMA +
                importProduct.getTaxImport();
        stringList = FileUtils.readFile(FILE_NAME_IMPORT);
        stringList.add(line);

        FileUtils.writeFile(FILE_NAME_IMPORT, stringList);
        System.out.println("Thêm thành công!!!");
    }

    public void showExtraProduct() {
        readAllFileExtra();
        if (extraProductList.isEmpty()) {
            System.out.println("Không có sản phẩm nào xuất khẩu");
        }
        for (ExtraProduct extraProduct : extraProductList) {
            extraProduct.showInFor();
        }
    }

    public void showImportProduct() {
        readAllFileImport();
        if (importProductList.isEmpty()) {
            System.out.println("Không có sản phẩm nào nhập khẩu");
        }
        for (ImportProduct importProduct : importProductList) {
            importProduct.showInFor();
        }
    }

    public void searchCodeExtra() {
        readAllFileExtra();
        System.out.print("Nhập Mã sản phẩm để tìm kiếm:");
        String codeProduct = InputKeyboard.inputCharacter();
        for (ExtraProduct extraProduct : extraProductList) {
            if (extraProduct.getCodeProduct().contains(codeProduct)) {
                System.out.println(extraProduct);
                flag = true;
            }
        }
        if (!flag) {
            System.err.println("Không tìm thấy!!!");
        }
    }

    public void searchNameExtra() {
        readAllFileExtra();
        System.out.print("Nhập Tên sản phẩm để tìm kiếm:");
        String codeProduct = InputKeyboard.inputCharacter();
        for (ExtraProduct extraProduct : extraProductList) {
            if (extraProduct.getNameProduct().contains(nameProduct)) {
                System.out.println(extraProduct);
                flag = true;
            }
        }
        if (!flag) {
            System.err.println("Không tìm thấy!!!");
        }
    }

    public void searchCodeImport() {
        readAllFileImport();
        System.out.print("Nhập Mã sản phẩm để tìm kiếm:");
        String codeProduct = InputKeyboard.inputCharacter();
        for (ImportProduct importProduct : importProductList) {
            if (importProduct.getCodeProduct().contains(codeProduct)) {
                System.out.println(importProduct);
                flag = true;
            }
        }
        if (!flag) {
            System.err.println("Không tìm thấy!!!");
        }
    }

    public void searchNameImport() {
        readAllFileImport();
        System.out.print("Nhập Tên sản phẩm để tìm kiếm:");
        String nameProduct = InputKeyboard.inputCharacter();
        for (ImportProduct importProduct : importProductList) {
            if (importProduct.getNameProduct().contains(nameProduct)) {
                System.out.println(importProduct);
                flag = true;
            }
        }
        if (!flag) {
            System.err.println("Không tìm thấy!!!");
        }
    }

    public void deleteExtra() {
        showExtraProduct();
        input.inputCodeProduct();
        for (int i = 0; i < extraProductList.size(); i++) {
            if (codeProduct.contains(extraProductList.get(i).getCodeProduct())) {
                System.out.println("Yes or No");
                if (scanner.nextLine().equals("Yes")) {
                    extraProductList.remove(i);
                    i--;
                } else {
                    return;
                }
            }
        }
        stringList = new ArrayList<>();
        for (ExtraProduct extraProduct : extraProductList) {
            String line = extraProduct.getId() + COMMA +
                    extraProduct.getCodeProduct() + COMMA +
                    extraProduct.getNameProduct() + COMMA +
                    extraProduct.getPriceProduct() + COMMA +
                    extraProduct.getAmountProduct() + COMMA +
                    extraProduct.getNameProducerProduct() + COMMA +
                    extraProduct.getPriceExtra() + COMMA +
                    extraProduct.getCountryExtra();
            stringList.add(line);
        }
        FileUtils.writeFile(FILE_NAME_EXTRA, stringList);
        showExtraProduct();
    }

    public void deleteImport() {
        showImportProduct();
        input.inputCodeProduct();
        for (int i = 0; i < importProductList.size(); i++) {
            if (codeProduct.contains(importProductList.get(i).getCodeProduct())) {
                System.out.println("Yes or No");
                if (scanner.nextLine().equals("Yes")) {
                    importProductList.remove(i);
                    i--;
                } else {
                    return;
                }
            }
        }
        stringList = new ArrayList<>();
        for (ImportProduct importProduct : importProductList) {
            String line = importProduct.getId() + COMMA +
                    importProduct.getCodeProduct() + COMMA +
                    importProduct.getNameProduct() + COMMA +
                    importProduct.getPriceProduct() + COMMA +
                    importProduct.getAmountProduct() + COMMA +
                    importProduct.getNameProducerProduct() + COMMA +
                    importProduct.getPriceImport() + COMMA +
                    importProduct.getCityImport() + COMMA +
                    importProduct.getTaxImport();
            stringList.add(line);
        }
        FileUtils.writeFile(FILE_NAME_IMPORT, stringList);
        showExtraProduct();
    }
}


