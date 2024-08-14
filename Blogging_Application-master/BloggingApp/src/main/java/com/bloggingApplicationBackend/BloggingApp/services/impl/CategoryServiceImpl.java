package com.bloggingApplicationBackend.BloggingApp.services.impl;

import com.bloggingApplicationBackend.BloggingApp.entities.Category;
import com.bloggingApplicationBackend.BloggingApp.entities.User;
import com.bloggingApplicationBackend.BloggingApp.exceptions.ResourceNotFoundException;
import com.bloggingApplicationBackend.BloggingApp.payloads.CategoryDto;
import com.bloggingApplicationBackend.BloggingApp.payloads.UserDto;
import com.bloggingApplicationBackend.BloggingApp.repositories.CategoryRepo;
import com.bloggingApplicationBackend.BloggingApp.services.CategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;


@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CategoryDto createCategory(CategoryDto categoryDto) {

        Category cat = this.modelMapper.map(categoryDto,Category.class);
        Category addedCat = this.categoryRepo.save(cat);
        return this.modelMapper.map(addedCat,CategoryDto.class);

//        User user = this.dtoToUser(userDto);
//        User savedUser = this.userRepo.save(user);
//        return this.userToDto(savedUser);

//        Category category = this.dtoToCategory(categoryDto);
//        Category savedCategory = this.categoryRepo.save(category);
//        return this.categoryToDto(savedCategory);
    }

    @Override
    public CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId) {

        Category cat = this.categoryRepo.findById(categoryId).orElseThrow(()-> new ResourceNotFoundException("Category ","categoryId",categoryId));

        cat.setCategoryTitle(categoryDto.getCategoryTitle());
        cat.setCategoryDescription(categoryDto.getCategoryDescription());

        Category updatedCat = this.categoryRepo.save(cat);


        return this.modelMapper.map(updatedCat,CategoryDto.class);
    }

    @Override
    public void deleteCategory(Integer categoryId) {

        Category cat = this.categoryRepo.findById(categoryId).orElseThrow(()-> new ResourceNotFoundException("Category ","categoryId",categoryId));
        this.categoryRepo.delete(cat);
    }

    @Override
    public CategoryDto getCategory(Integer categoryId) {

        Category cat = this.categoryRepo.findById(categoryId).orElseThrow(()->new ResourceNotFoundException("Category ","categoryId",categoryId));
        return this.modelMapper.map(cat,CategoryDto.class);
    }

    @Override
    public List<CategoryDto> getCategories() {

        List<Category> categories = this.categoryRepo.findAll();
        List<CategoryDto> catDtos = categories.stream().map((cat)-> this.modelMapper.map(cat,CategoryDto.class)).collect(Collectors.toList());

        return catDtos;
    }


//
//    private Category dtoToCategory(CategoryDto categoryDto){
//        Category cat = this.modelMapper.map(categoryDto, Category.class);
//
////		user.setId(userDto.getId());
////		user.setName(userDto.getName());
////		user.setEmail(userDto.getEmail());
////		user.setAbout(userDto.getAbout());
////		user.setPassword(userDto.getPassword());
//        return cat;
//
//    }
//
//    private CategoryDto categoryToDto(Category cat)
//    {
//        CategoryDto catDto = this.modelMapper.map(cat, CategoryDto.class);
////		userDto.setId(user.getId());
////		userDto.setName(user.getName());
////		userDto.setEmail(user.getEmail());
////		userDto.setAbout(user.getAbout());
////		userDto.setPassword(user.getPassword());
//        return catDto;
//    }
}
